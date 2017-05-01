package Test;

import BeforeCase.CaseTmpl;

public class TestOne  extends CaseTmpl{

	public void test(){
		solo.waitForText("取消");
		solo.clickOnView("negative_button");
		solo.sleep(5000);
	}
}
