package Test;

import org.junit.experimental.theories.suppliers.TestedOn;

import Helper.Solo;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

public class TestOne extends ActivityInstrumentationTestCase2{
/*	public TestOne(Class activityClass){
		super(activityClass);
	}*/
	public  static Class<?> launchActivityClass;
	public static String packageName="com.shishike.calm";
	public static String mainActivity="com.shishike.calm.splash.autoset.StartActivity_";
	public Activity activity;
	public Solo solo;
	

	static{ 
		try{ 
			launchActivityClass = Class.forName(mainActivity); 
	}
	catch(ClassNotFoundException e){ 
		throw new RuntimeException(e);
		}
	} 

	@SuppressWarnings({ "unchecked", "deprecation" })
	public TestOne(){
		super(packageName, launchActivityClass);
	}
	@Override
	public  void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		this.activity=this.getActivity();
		this.solo=new Solo(getInstrumentation(),getActivity());
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	public void test(){
		
	}

}
