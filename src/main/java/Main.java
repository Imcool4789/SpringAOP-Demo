import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xm");
        BuddyInfoService buddyService = context.getBean("buddyService",BuddyInfoService.class);
        System.out.println("Name: " + buddyService.getBuddyInfo().getName());
        System.out.println("Address: " + buddyService.getBuddyInfo().getAddress());
        System.out.println("Phone Number: " + buddyService.getBuddyInfo().getPhone_num());
        buddyService.getBuddyInfo().setName("Mark");
        buddyService.getBuddyInfo().setAddress("123 Beach Dr");
        buddyService.getBuddyInfo().setPhone_num("555-555-5555");
    }
}
