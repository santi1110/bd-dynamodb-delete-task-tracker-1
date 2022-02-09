### Deleting completed tasks

Expected time required: 10 min

You're creating a database to help with work productivity. One of the tables in your database is called `TaskTracker`. 
The `TaskTracker` table keeps track of different tasks that need to be completed and has the following attributes:

* `job_id` : partition key—unique `String` identifier for each job
* `completed_by` : name of the person who completed the job
* `hours_taken` : the number of hours it took it complete the job
* `year_completed` : the year the task was completed

You want to be able to delete tasks from the table after they've been completed. Implement the `deleteTask()` class in
the `TaskDAO` class to implement this functionality. The Task class is already written for you, but you'll need to 
annotate it properly. The `getTask()` and `saveTask()` methods are also already set-up for you. 

The unit tests in `TaskDAOTest` are set-up with a mock database so that you can test your methods offline. The `main()` 
method is set-up in `TaskApp` so that you can connect to the real `TaskTracker` table and test your methods that way.

HINTS:
* [I'm getting the error `'no HASH key value present'` when I attempt to delete an item.](./hints/hint-01.md)
