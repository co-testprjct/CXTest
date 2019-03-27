package MSPkg;
import com.qa.pages.MyProfileMyRewards;

public class MsTest extends MyProfileMyRewards {
	public static void main(String[] args) throws Exception {
		MyProfileMyRewards obj= new MyProfileMyRewards();
		obj.setUp();
		obj.verifyClickOnMyProfile();
	}
}
