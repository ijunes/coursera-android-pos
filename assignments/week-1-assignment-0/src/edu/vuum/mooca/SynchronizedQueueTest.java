package edu.vuum.mooca;
import static org.junit.Assert.*;

import java.util.concurrent.ArrayBlockingQueue;

import org.junit.Before;
import org.junit.Test;

import edu.vuum.mooca.SynchronizedQueue.*;

/**
 * @class SynchronizedQueueTest
 *
 * @brief This class tests queues for proper functionality by 
<<<<<<< HEAD
 * 	  using the testQueue method defined in SynchronizedQueue.java
=======
 * 	using the testQueue method defined in SynchronizedQueue.java
>>>>>>> 9fd1c4e49778d97613b3d9cc324c279dfb2e7274
 */
public class SynchronizedQueueTest {
    /**
     * Indicates how big the queue should be.
     */
    int queueSize;
	
    /**
     * Run the test for the queue parameter.
     *
     * @return result. If SynchronizedQueue test ran properly, returns
     * null. If not, returns error message.
     */
<<<<<<< HEAD
    static String runQueueTest(String qName, QueueAdapter<Integer> queue) {
    	System.out.println("Starting " + qName + " test...");
=======
    static String runQueueTest(QueueAdapter<Integer> queue) {
>>>>>>> 9fd1c4e49778d97613b3d9cc324c279dfb2e7274

        SynchronizedQueueResult result =
            SynchronizedQueue.testQueue(queue);

<<<<<<< HEAD
        System.out.println("End " + qName + " test.\n");
        System.out.println("See JUnit view for results -- \n" +
                           "Green check-marks denote program correctness. \n" +
                           "Blue x-marks indicate a problem with your implementation. \n");
        
=======
>>>>>>> 9fd1c4e49778d97613b3d9cc324c279dfb2e7274
        if (result != SynchronizedQueueResult.RAN_PROPERLY)
            return result.getString();
		
        return null;
    }
	
    /**
     * Runs before each test. Sets queueSize.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        // Indicate how big the queue should be, which should be
        // smaller than the number of iterations to induce blocking
        // behavior.
        queueSize = SynchronizedQueue.mMaxIterations / 10;
    }

    /**
     * Tests the ArrayBlockingQueue, which should pass without error.
     */
    @Test
    public void arrayBlockingQueueTest() {
        QueueAdapter<Integer> queueAdapter =
            new QueueAdapter<Integer>(new ArrayBlockingQueue<Integer>(queueSize));
<<<<<<< HEAD
        String errors = runQueueTest("ArrayBlockingQueue", queueAdapter);
=======
        String errors = runQueueTest(queueAdapter);
>>>>>>> 9fd1c4e49778d97613b3d9cc324c279dfb2e7274

        assertNull("Error occurred: " + 
                   errors,
                   errors);
    }
<<<<<<< HEAD
=======
	
    /**
     * Tests the ArrayBlockingQueue, which succeeds if the
     * SynchronizedQueueTester fails.
     */
    @Test
    public void buggyBlockingQueueTest() {
        QueueAdapter<Integer> queueAdapter =
            new QueueAdapter<Integer>(new BuggyBlockingQueue<Integer>(queueSize));
        String errors = runQueueTest(queueAdapter);
        assertNotNull("Test should not complete without errors. " +
                      "BuggyBlockingQueue is intended to function incorrectly.",
                      errors);
    }

>>>>>>> 9fd1c4e49778d97613b3d9cc324c279dfb2e7274
}
