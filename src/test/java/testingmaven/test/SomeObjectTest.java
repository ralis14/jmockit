package testingmaven.test;

import mockit.*;
import mockit.integration.junit4.JMockit;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Raul on 2/19/2017.
 */

public class SomeObjectTest {

    @Injectable
    SomeObject obj;



    @Before
    public void setUp() throws Exception {
        //obj = new SomeObject(3, "joe");
    }


    @Test
    public void testData() throws Exception {
        //NonStrict allows the partial implementation of a class
        new NonStrictExpectations(SomeObject.class){{
            obj.getData();
            returns(3);
        }};
        assertEquals(3, obj.getData());
        new Verifications(){{obj.getData(); times = 1;}};


    }

    @Test
    public void testCalculateTransaction() throws Exception {
        new NonStrictExpectations(SomeObject.class){{
            obj.calculateTransaction(anyInt, anyInt);
            returns(3);
        }};
        assertEquals(3, obj.calculateTransaction(3,3));
        obj.getData();
        new Verifications(){{obj.getData(); times = 1;}};
    }

    @Test
    public void testGetId() throws Exception {
        new NonStrictExpectations(SomeObject.class){{
            obj.getId();
            returns(1);
        }};
        assertEquals(1, obj.getId());
    }

    @Test
    public void testSetId() throws Exception {
        new NonStrictExpectations(SomeObject.class){{
            obj.getId();
            returns(2);
        }};
        obj.setId(2);
        assertEquals(2, obj.getId());
        new Verifications(){{obj.setId(anyInt); times =1;}};
    }

    @Test
    public void testGetName() throws Exception {
        new NonStrictExpectations(SomeObject.class){{
            obj.getName();
            returns("joe");
        }};
        assertEquals("joe", obj.getName());
    }

    @Test
    public void testSetName() throws Exception {
        new NonStrictExpectations(SomeObject.class){{
            obj.getName();
            result = "jose";
        }};
        obj.setName("jose");
        assertEquals("jose", obj.getName());
        new Verifications(){{obj.setName(anyString); times = 1;}};
    }

    @Test
    public void testGetData() throws Exception {
        new NonStrictExpectations(SomeObject.class){{
            obj.getData();
            returns(0);
        }};
        assertEquals(0,obj.getData());

    }

    @Test
    public void testSetData() throws Exception {
        new NonStrictExpectations(SomeObject.class){{obj.getData(); returns(1);}};
        obj.setData(1);
        assertEquals(1, obj.getData());
        new Verifications(){{obj.setData(anyInt); times = 1;}};
    }

}