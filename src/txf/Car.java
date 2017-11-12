/* һ. ��ĿҪ�󣺿���װ��һ��������ӻ������ԣ�ϴ�»����ɣ�����һ������ӿ�ComputeWeight����������Television
 * Computer��WashMachine�̳иýӿڣ�ʵ������巽�����õ����� ����car���ж����Ա����ΪComputeWeight��
 * �ͣ�����Ԫ�ش�������������ã��������car����������ػ������������
 * ��. Java��ת�Ͷ���
 * ��. 2017��11��7��
 * ��. lv.o
 */

package txf;
//����ӿ�
interface ComputeWeight{
	public double computeweight();
}
//����ӿڵ��ӻ�
class Television implements ComputeWeight{
	private double T_weight;//ÿ̨���ӻ�����
	private int x; //���ӻ�����
	public Television(double n,int m){
		T_weight=n;
		x=m;
	}
	public double computeweight() {
		return T_weight*x;//�õ������е��ӻ���������
	}
		
}
class Computer implements ComputeWeight{
	private double C_weight;//ÿ̨��������
	private int y; //��������
	public Computer(double n,int m){
		C_weight=n;
		y=m;
	}
	public double computeweight() {
		return C_weight*y;//�õ������е��Ե�����
	}
		
}
class WashMachine implements ComputeWeight{
	private double W_weight;//ÿ̨ϴ�»�������
	private int y;//ϴ�»�������
	public WashMachine(double n,int m){
		W_weight=n;
		y=m;
	}
	public double computeweight() {
		return W_weight*y;//�õ�������ϴ�»���������
	}
		
}
public class Car {
	ComputeWeight [] com=new ComputeWeight[3];//�����ӿ��������鼰�䳤��
	public Car(){
		com[0]=new Television(30,10);
		com[1]=new Computer(6,20);
		com[2]=new WashMachine(100,5);
	}
	//�õ������е��ӻ������ԣ�ϴ�»���������
	public void sum(){
		
		System.out.println("����������Ϊ��"+(com[0].computeweight()+com[1].computeweight()+com[2].computeweight()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.sum();

	}

}