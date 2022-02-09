import com.amazon.ata.aws.dynamodb.DynamoDbClientProvider;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class TaskApp {

    /**
     * Test your methods on a real database connection. Should print 'null'.
     * @param args main method values
     */
    public static void main(String[] args) {
        //GIVEN
        DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient());
        Task task = new Task();
        String partitionKey = "JO7895";
        task.setJobId(partitionKey);

        //WHEN
        TaskDAO taskDAO = new TaskDAO(mapper);
        taskDAO.deleteTask(task);

        Task deletedTask = taskDAO.getTask(partitionKey);

        //THEN
        System.out.println("null value: " + deletedTask);
    }
}
