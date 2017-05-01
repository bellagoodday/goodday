package Test;

import org.junit.experimental.theories.suppliers.TestedOn;

import com.robotium.solo.Solo;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

@SuppressWarnings("rawtypes")
public class TestOne extends ActivityInstrumentationTestCase2{

	
	private static String packageName="com.shishike.calm";
	private static String mainActivity="com.shishike.calm.autoset.StartActivity_";
	private Solo solo;
	public Activity activity;
	
	private  static Class<?> launchActivityClass;
	

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
		super(packageName, launchActivityClass);//和测试类连接起来
	}
	
	
	@Override
	public  void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		this.activity=this.getActivity();
		this.solo=new Solo(getInstrumentation(),getActivity());//启动被测应用
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	public void test(){
		
	}

}
