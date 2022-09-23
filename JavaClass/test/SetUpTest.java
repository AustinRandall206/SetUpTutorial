package test;


import org.junit.Assert;
import org.junit.Test;
import src.main.SetUp;

public class SetUpTest {
    private SetUp setUp;

    public SetUpTest(){
        setUp= new SetUp();
    }
    @Test
    public void twoPlusTwo(){
        int x = 2;
        int y = 2;
        setUp.twoPlusTwo(x,y);
    }

}
