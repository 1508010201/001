/*���������ӿ�StudentManageInterface��TeacherManageInterface�ֱ��������ѧ��ѧ�Ѻ͵õ�ѧ* ��ѧ�ѣ�
 * ������ʦ���ʺ͵õ���ʦ���ʵķ���������һ��Graduate��̳��������ӿڣ�ʵ�����ǵľ��巽���� �����
 * һ��Graduate�����ж϶����һ��Ĺ��ʼ�ȥѧ���Ƿ�С��2000�����С��2000�������provide a loan 
 */
//Java���ӿ�
//2017��11��7��
//lv.o

package txf;
//ѧ����Ϣ����ӿ�
interface  StudentManageInterface{
	void setFee(double fee);
	double  getFee();
}
//��ʦ��Ϣ����ӿ�
interface  TeacherManageInterface{
	void setPay(double pay);
	double  getPay();
}
//�о���ʵ���������ӿ�
class Graduate implements  StudentManageInterface,TeacherManageInterface{
    private String name; //����
    private char sex;  //�Ա�
    private int age; //����
    private double fee; //ÿѧ��ѧ��
    private  double pay;//ÿ�¹���
 
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
		// TODO �Զ����ɵķ������
		 Graduate zhangsan=new Graduate();
		 zhangsan.setPay(500);
		 zhangsan.setFee(5500);
		 //�����н��ȥѧ��С��2000������Ҫ����
		 if(zhangsan.getPay()*12-zhangsan.getFee()<2000)
		 {
			 System.out.println("provide a loan");
		 }
		 else
			 System.out.println("��ܰ�������Ҫ���");
	}

}
