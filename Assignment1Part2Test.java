package validator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Assignment1Part2Test {
    private ISBNValidate isbn;

    @Before
    public void setUp() throws Exception {
        isbn = new ISBNValidate();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLessThanTenChars(){
        isbn.tidyISBN10or13InsertingDashes("123456789");
    };


    @Test(expected = IllegalArgumentException.class)
    public void testBetweenTenAndThirteenChars(){
        isbn.tidyISBN10or13InsertingDashes("12345678901");
    };


    @Test(expected = IllegalArgumentException.class)
    public void testMoreThanThirteenChars(){
        isbn.tidyISBN10or13InsertingDashes("12345678901234");
    };

    @Test(expected = IllegalArgumentException.class)
    public void testWrongCheckDigitTenChars(){
        isbn.tidyISBN10or13InsertingDashes("1234567891");
    };

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidThirteenChars(){
        isbn.tidyISBN10or13InsertingDashes("1234567890123");
    };

    @Test(expected = IllegalArgumentException.class)
    public void testValidThirteenChars(){
        isbn.tidyISBN10or13InsertingDashes("9784567890123");
    };

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyString(){
        isbn.tidyISBN10or13InsertingDashes("");
    };

}