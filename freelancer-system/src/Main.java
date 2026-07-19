import entity.*;
import service.OfferService;
import service.ProjectService;
import service.SkillService;
import service.UserService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    // سرویس‌هایی که خودتان پیاده‌سازی خواهید کرد
    private static final UserService userService = new UserService();
    private static final ProjectService projectService = new ProjectService();
    private static final OfferService offerService = new OfferService();
    private static final SkillService skillService = new SkillService();

    private static User currentUser;

    public static void main(String[] args) {
        while (true) {
            if (currentUser == null) {
                showLoginMenu();
            } else {
                showMainMenu();
            }
        }
    }

    private static void showLoginMenu() {
        System.out.println("\n=== سیستم مدیریت پروژه فریلنسری ===");
        System.out.println("1. ورود");
        System.out.println("2. ثبت نام");
        System.out.println("3. خروج");
        System.out.print("انتخاب شما: ");

        int choice = getIntInput();

        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                System.out.println("خروج از برنامه...");
                System.exit(0);
                break;
            default:
                System.out.println("ورودی نامعتبر!");
        }
    }

    private static void showMainMenu() {
        System.out.println("\n=== منوی اصلی ===");
        System.out.printf("welcome %s\n", currentUser.getUsername());
        System.out.printf("balance: $%,.0f\n", currentUser.getBalance());

        if (currentUser.getType() == UserType.CLIENT) {
            showClientMenu();
        } else {
            showFreelancerMenu();
        }
    }

    private static void showClientMenu() {
        System.out.println("\n1. ایجاد پروژه جدید");
        System.out.println("2. مشاهده پروژه‌های من");
        System.out.println("3. مشاهده پیشنهادات پروژه");
        System.out.println("4. انتخاب پیشنهاد");
        System.out.println("5. تکمیل پروژه");
        System.out.println("6. افزایش موجودی");
        System.out.println("7. خروج از حساب");
        System.out.print("انتخاب شما: ");

        int choice = getIntInput();

        switch (choice) {
            case 1:
                createProject();
                break;
            case 2:
                viewMyProjects();
                break;
            case 3:
//                viewProjectOffers();
                break;
            case 4:
//                selectOffer();
                break;
            case 5:
//                completeProject();
                break;
            case 6:
                addBalance();
                break;
            case 7:
                logout();
                break;
            default:
                System.out.println("ورودی نامعتبر!");
        }
    }

    private static void showFreelancerMenu() {
        System.out.println("\n1. مشاهده پروژه‌های باز");
        System.out.println("2. ارسال پیشنهاد برای پروژه");
        System.out.println("3. مشاهده پیشنهادات من");
        System.out.println("4. افزودن مهارت");
        System.out.println("5. مشاهده مهارت‌های من");
        System.out.println("6. افزایش موجودی");
        System.out.println("7. خروج از حساب");
        System.out.print("انتخاب شما: ");
        
        int choice = getIntInput();
        
        switch (choice) {
            case 1:
//                viewOpenProjects();
                break;
            case 2:
//                submitOffer();
                break;
            case 3:
//                viewMyOffers();
                break;
            case 4:
                addSkill();
                break;
            case 5:
                viewMySkills();
                break;
            case 6:
                addBalance();
                break;
            case 7:
                logout();
                break;
            default:
                System.out.println("ورودی نامعتبر!");
        }
    }

    // متدهای ورود و ثبت نام
    private static void login() {
        System.out.print("نام کاربری: ");
        String username = scanner.nextLine();
        System.out.print("رمز عبور: ");
        String password = scanner.nextLine();
        
        currentUser = userService.login(username, password);
        if (currentUser != null) {
            System.out.println("ورود موفق!");
        } else {
            System.out.println("نام کاربری یا رمز عبور اشتباه است!");
        }
    }

    private static void register() {
        System.out.print("نام کاربری: ");
        String username = scanner.nextLine();
        System.out.print("رمز عبور: ");
        String password = scanner.nextLine();
        System.out.println("نوع کاربر (1. کارفرما 2. فریلنسر): ");
        int typeChoice = getIntInput();
        
        UserType type = (typeChoice == 1) ? UserType.CLIENT : UserType.FREELANCER;
        currentUser = userService.register(username, password, type);
        
        if (currentUser != null) {
            System.out.println("ثبت نام موفق!");
        } else {
            System.out.println("این نام کاربری قبلاً استفاده شده است!");
        }
    }

    // متدهای کارفرما
    private static void createProject() {
        System.out.print("عنوان پروژه: ");
        String title = scanner.nextLine();
        System.out.print("توضیحات: ");
        String description = scanner.nextLine();
        System.out.print("قیمت پیشنهادی: ");
        double price = getDoubleInput();
        System.out.print("ساعت تخمینی: ");
        long hours = getLongInput();
        
        // دریافت مهارت‌های مورد نیاز
        Set<Skill> skills = new HashSet<>();
        System.out.println("مهارت‌های مورد نیاز (برای پایان 'done' را وارد کنید):");
        while (true) {
            System.out.print("نام مهارت: ");
            String skillName = scanner.nextLine();
            if (skillName.equalsIgnoreCase("done")) break;

            Skill skill = Skill.valueOf(skillName);
            skills.add(skill);
        }
        
        Project project = projectService.createProject((Client) currentUser, title, description, price, skills, hours);
        if (project != null) {
            System.out.println("پروژه با موفقیت ایجاد شد! شناسه: " + project.getId());
        } else {
            System.out.println("خطا در ایجاد پروژه!");
        }
    }

    private static void viewMyProjects() {
        Set<Project> projects = projectService.getClientProjects((Client) currentUser);
        if (projects.isEmpty()) {
            System.out.println("شما هیچ پروژه‌ای ندارید.");
        } else {
            for (Project project : projects) {
                System.out.println(project);
            }
        }
    }

    //    private static void viewProjectOffers() {
//        System.out.print("شناسه پروژه: ");
//        long projectId = getLongInput();
//
//        Set<Offer> offers = offerService.getOffersByProject(projectId);
//        if (offers.isEmpty()) {
//            System.out.println("هیچ پیشنهادی برای این پروژه وجود ندارد.");
//        } else {
//            for (Offer offer : offers) {
//                System.out.println(offer);
//            }
//        }
//    }
//
//    private static void selectOffer() {
//        System.out.print("شناسه پیشنهاد: ");
//        long offerId = getLongInput();
//
//        boolean success = offerService.selectOffer(offerId, (Client) currentUser);
//        if (success) {
//            System.out.println("پیشنهاد با موفقیت انتخاب شد!");
//        } else {
//            System.out.println("خطا در انتخاب پیشنهاد!");
//        }
//    }
//
//    private static void completeProject() {
//        System.out.print("شناسه پروژه: ");
//        long projectId = getLongInput();
//
//        boolean success = projectService.completeProject(projectId, (Client) currentUser);
//        if (success) {
//            System.out.println("پروژه با موفقیت تکمیل شد!");
//        } else {
//            System.out.println("خطا در تکمیل پروژه!");
//        }
//    }
//
//    // متدهای فریلنسر
//    private static void viewOpenProjects() {
//        Set<Project> projects = projectService.getOpenProjects();
//        if (projects.isEmpty()) {
//            System.out.println("هیچ پروژه باز وجود ندارد.");
//        } else {
//            for (Project project : projects) {
//                System.out.println(project);
//            }
//        }
//    }
//
//    private static void submitOffer() {
//        System.out.print("شناسه پروژه: ");
//        long projectId = getLongInput();
//        System.out.print("ساعت پیشنهادی: ");
//        long hours = getLongInput();
//        System.out.print("قیمت پیشنهادی: ");
//        double price = getDoubleInput();
//
//        Offer offer = offerService.submitOffer((Freelancer) currentUser, projectId, hours, price);
//        if (offer != null) {
//            System.out.println("پیشنهاد با موفقیت ارسال شد! شناسه: " + offer.getId());
//        } else {
//            System.out.println("خطا در ارسال پیشنهاد!");
//        }
//    }
//
//    private static void viewMyOffers() {
//        Set<Offer> offers = offerService.getFreelancerOffers((Freelancer) currentUser);
//        if (offers.isEmpty()) {
//            System.out.println("شما هیچ پیشنهادی ارسال نکرده‌اید.");
//        } else {
//            for (Offer offer : offers) {
//                System.out.println(offer);
//            }
//        }
//    }

    private static void addSkill() {
        System.out.print("نام مهارت: ");
        String skillName = scanner.nextLine();

        Skill skill = Skill.valueOf(skillName);
        boolean success = ((Freelancer) currentUser).addSkill(skill);
        if (success) {
            System.out.println("مهارت با موفقیت اضافه شد!");
        } else {
            System.out.println("این مهارت قبلاً به شما اضافه شده است.");
        }
    }

    private static void viewMySkills() {
        Set<Skill> skills = ((Freelancer) currentUser).getSkills();
        if (skills.isEmpty()) {
            System.out.println("شما هیچ مهارتی ندارید.");
        } else {
            System.out.println(skills);
        }
    }

    // متدهای عمومی
    private static void addBalance() {
        System.out.print("مبلغ مورد نظر: ");
        double amount = getDoubleInput();
        
        userService.addBalance(currentUser, amount);
        System.out.println("موجودی با موفقیت افزایش یافت. موجودی فعلی: " + currentUser.getBalance());
    }

    private static void logout() {
        System.out.println("خروج از حساب " + currentUser.getUsername());
        currentUser = null;
    }

    // متدهای کمکی برای دریافت ورودی
    private static int getIntInput() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.print("لطفاً یک عدد صحیح وارد کنید: ");
            }
        }
    }

    private static long getLongInput() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Long.parseLong(input.trim());
            } catch (NumberFormatException e) {
                System.out.print("لطفاً یک عدد صحیح وارد کنید: ");
            }
        }
    }

    private static double getDoubleInput() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input.trim());
            } catch (NumberFormatException e) {
                System.out.print("لطفاً یک عدد معتبر وارد کنید: ");
            }
        }
    }
}