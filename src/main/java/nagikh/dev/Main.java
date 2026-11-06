package nagikh.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        TaskContext s1 = context.getBean(TaskContext.class);
        TaskContext s2 = context.getBean(TaskContext.class);

        System.out.println(s1.id());
        System.out.println(s2.id());
        System.out.println(s1 == s2); // для prototype будет false

        JobRunner j1 = context.getBean(JobRunner.class);
        j1.runOnce();
        j1.runOnce();

        context.close();
    }
}
