import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by eugenevendensky on 2/24/17.
 */
public class LinkedListTest {

    LinkedList<Double> list;

    @Before
    public void setUp(){list = new LinkedList<>();

        list.insert(1.01);
        list.insert(2.02);
        list.insert(3.03);
        list.insert(4.04);
        list.insert(5.05);
    }


    @Test
    public void insertTest(){

        list.printList();

    }

    @Test
    public void findTest(){

        int actual = list.find(1).id;
        int expected = 3;
        assertEquals(actual,expected);

    }




}
