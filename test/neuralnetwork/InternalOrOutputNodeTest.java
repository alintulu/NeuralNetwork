/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetwork;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alintulu
 */
public class InternalOrOutputNodeTest {
    
    InternalOrOutputNode node;
    
    public InternalOrOutputNodeTest() {
        node = new InternalOrOutputNode("test");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class InternalOrOutputNode.
     */
    @Test
    public void testGetName() {
        System.out.println("Testing getName..");
        assertEquals("test", node.getName());
    }

    /**
     * Test of weightFunc method, of class InternalOrOutputNode.
     */
    @Test
    public void testWeightFunc() {
        System.out.println("Testing weightFunc..");
        double learningRate = 0.0;
        double output = 0.0;
        double error = 0.0;
        double input = 0.0;
        double result = node.weightFunc(learningRate, output, error, input);
        assertEquals(0.0, result, 0.0);
    }

    /**
     * Test of getOutput method, of class InternalOrOutputNode.
     */
    @Test
    public void testGetOutput() {
        System.out.println("getOutput");
        double[] inputVal = null;
        InternalOrOutputNode instance = null;
        double expResult = 0.0;
        double result = instance.getOutput(inputVal);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBias method, of class InternalOrOutputNode.
     */
    @Test
    public void testAddBias() {
        System.out.println("addBias");
        InternalOrOutputNode instance = null;
        instance.addBias();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEdge method, of class InternalOrOutputNode.
     */
    @Test
    public void testAddEdge() {
        System.out.println("addEdge");
        Edge edge = null;
        boolean edgeType = false;
        InternalOrOutputNode instance = null;
        instance.addEdge(edge, edgeType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getError method, of class InternalOrOutputNode.
     */
    @Test
    public void testGetError() {
        System.out.println("getError");
        double trueVal = 0.0;
        boolean printError = false;
        InternalOrOutputNode instance = null;
        double expResult = 0.0;
        double result = instance.getError(trueVal, printError);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWeights method, of class InternalOrOutputNode.
     */
    @Test
    public void testUpdateWeights() {
        System.out.println("updateWeights");
        double learningRate = 0.0;
        InternalOrOutputNode instance = null;
        instance.updateWeights(learningRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearOutput method, of class InternalOrOutputNode.
     */
    @Test
    public void testClearOutput() {
        System.out.println("Testing clearOutput..");
        node.clearOutput();
        assertEquals(null, node.output);
    }
    
}
