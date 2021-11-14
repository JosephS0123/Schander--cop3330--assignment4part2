package ucf.assignments;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// These tests will most likely be separated but for simplicity's sake I will have all of them here
public class AppTest {
    @Test
    public void Test() {
        //Tests for fileOptions
        /*
       These numbers will represent these things in the assertions
        1,initialize some todoList
        2,initialize a todoList file
        3,initialize a folder of todoList files
        4,initialize an empty list of lists
        5,initialize a list of lists with the todoList added to it
        6,initialize a list of lists with the file of todoLists added to it
        assertTrue(saveList(1))
        assertTrue(saveAllLists(1))
        assertEquals(5,loadOneList(2,1))
        assertEquals(6,loadManyLists(3,2))
         */
        //Tests for listOptions
        //Again note that the todoLists themselves will most likely be hashmaps
        /*
            1,initialize an empty list of todoLists
            2,initialize a list of todoLists with a single empty todoList in it with the name "nameOfList"
            3,initialize a todoList
            4,initialize a list of todoLists with number 3 in it and nothing else
            5,initialize a list of todoLists with a single empty todoList in it with the name "newNameOfList"
            assertEquals(2,addList(1,"nameOfList"))
            assertEquals(1,deleteList(4,3))
            assertEquals(5,editListTitle(2,"newNameOfList"))

         */
        //Tests for itemOptions
        /*
            1,initialize an empty list
            2,initialize a list with a single item in it with the name"ItemName"Desc of "ItemDesc"and Date of"1/23/45"
            3,initialize a list with a single item in it with the name"ItemName"Desc of "NewItemDesc" and Date of "1/23/45"
            4,initialize a list with a single item in it with the name"ItemName"Desc of "ItemDesc" and Date of "2/34/56"
            5,initialize a list with a single item in it with the name"ItemName"Desc of "ItemDesc"and Date of"1/23/45" and set its mark to True
            6,initialize a list filled with several items half of them marked completed and half of them marked incomplete and all the items with random dates
            7,initialize a list identical to 6 but includes only the items marked completed
            8,initialize a list identical to 6 but includes only the items marked incomplete
            9,initialize a list identical to 6 but the items are sorted by date
            call addItem(1,"ItemName","ItemDesc","ItemDate")
            assertEquals(2,1) // this will test addItem
            reset 1 and 2
            call removeItem(2,"ItemName")
            assertEquals(1,2) // tests removeItem
            reset 1 and 2
            call editItemDescription(2,"ItemName","NewItemDesc")
            assertEquals(3,2) // tests editItemDescription
            reset 2 and 3
            call editItemDate(2,"ItemName","2/34/56"))
            assertEquals(4,2)// tests editItemDate
            reset 2 and 4
            call editItemMark(2,"ItemName")
            assertEquals(5,2) // tests editItemMark
            reset 2 and 5
            assertEquals(7,showCompletedItems(6))
            assertEquals(8,showIncompleteItems(6))
            assertEquals(9,sortByDueDate(6))

         */

    }
}
