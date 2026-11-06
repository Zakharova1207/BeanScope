package nagikh.dev;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class JobRunner {
    private final ObjectProvider<TaskContext> taskContextProvider;

    private JobRunner(ObjectProvider<TaskContext> taskContextProvider) {
        this.taskContextProvider = taskContextProvider;
    }

    public void runOnce(){
        TaskContext taskContext = taskContextProvider.getObject();
        System.out.println(taskContext.id());
    }
}
