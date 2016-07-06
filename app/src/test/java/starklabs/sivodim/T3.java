package starklabs.sivodim;

import android.content.Context;
import android.widget.ArrayAdapter;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.StringReader;
import java.util.Vector;

import static org.junit.Assert.*;

import starklabs.sivodim.Drama.Model.Screenplay.Screenplay;
import starklabs.sivodim.Drama.Presenter.ScreenplayPresenter;
import starklabs.sivodim.Drama.Presenter.ScreenplayPresenterImpl;
import static org.mockito.Mockito.when;
/**
 * Created by Enrico on 21/06/16.
 */
/**
 * test TU3 that test the creation of a ScreenPlay with the correct title
 */
public class T3 {
    @Test
    public void testNewScreenplay(){
        Context context= Mockito.mock(Context.class);
        when(context.getFilesDir()).thenReturn(new File("/Users/Enrico/Desktop/test"));

        Screenplay s=null;
        ScreenplayPresenterImpl test = new ScreenplayPresenterImpl(s);
        String name="titolo";
        String error=",:%YIK/KL£&(L";
        test.newScreenplay(name,context);
        test.newScreenplay(error,context);

        File file=new File(context.getFilesDir(),name+".scrpl");
        File fileError=new File(context.getFilesDir(),error+".scrpl");


        assertEquals(true,file.exists());
        assertEquals(false,fileError.exists());
    }
}