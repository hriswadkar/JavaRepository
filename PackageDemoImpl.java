import com.java.test.MyPackageClass;

public class PackageDemoImpl extends MyPackageClass {
	public PackageDemoImpl() {
		super.packageMethod();
		//super.defaultAccessMethod();
		// above line will not compile as the method
		// is having default access in the method definition
		// since it is being called outside its package
		// it will not work and result in compilation error
	}
	public static void main(String[] args) {
		new PackageDemoImpl();
	}
}