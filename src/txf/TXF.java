/*定义两个接口StudentManageInterface，TeacherManageInterface分别具有设置学生学费和得到学* 生学费，
 * 设置老师工资和得到老师工资的方法，定义一个Graduate类继承这两个接口，实现他们的具体方法， 最后定义
 * 一个Graduate对象，判断对象的一年的工资减去学费是否小于2000，如果小于2000，则输出provide a loan 
 */
//Java，接口
//2017年11月7日
//lv.o

package txf;
//学生信息管理接口
interface  StudentManageInterface{
	void setFee(double fee);
	double  getFee();
}
//老师信息管理接口
interface  TeacherManageInterface{
	void setPay(double pay);
	double  getPay();
}
//研究生实现上两个接口
class Graduate implements  StudentManageInterface,TeacherManageInterface{
    private String name; //姓名
    private char sex;  //性别
    private int age; //年龄
    private double fee; //每学期学费
    private  double pay;//每月工资
 
    public void setPay(double pay) 
	{
		this.pay=pay;
	}

	
	public double getPay() 
	{
		return pay;
	}

	public void setFee(double fee) 
	{
		this.fee=fee;
	}

	public double getFee() 
	{
	  return fee;	
	}
	
}

public class TXF 
{
	public static void main(String[] args) 
	{
		// TODO 自动生成的方法存根
		 Graduate zhangsan=new Graduate();
		 zhangsan.setPay(500);
		 zhangsan.setFee(5500);
		 //如果年薪减去学费小于2000，则需要贷款
		 if(zhangsan.getPay()*12-zhangsan.getFee()<2000)
		 {
			 System.out.println("provide a loan");
		 }
		 else
			 System.out.println("你很棒，不需要贷款！");
	}

}
