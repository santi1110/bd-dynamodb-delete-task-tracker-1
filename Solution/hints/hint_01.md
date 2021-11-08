Make sure that the task the `deleteTask()` method is accepting has a partition key value set since that's what the 
`DynamoDBMapper delete()` method looks for when deleting an item.
