package Util;

import android.app.Activity;
import android.app.Instrumentation;
import android.view.View;

import com.robotium.solo.Solo;

public class MySolo extends Solo{

	public MySolo(Instrumentation instrumentation, Activity activity) {
		super(instrumentation, activity);
		// TODO Auto-generated constructor stub
	}
	public void clickOnView(String id){
		View view=super.getView(id);
		super.clickOnView(view);
	}
	

}
