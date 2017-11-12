/* 一. 题目要求：卡车装载一车货物，电视机，电脑，洗衣机若干，定义一个父类接口ComputeWeight，三个子类Television
 * Computer，WashMachine继承该接口，实现其具体方法，得到自重 ，在car类中定义成员数组为ComputeWeight类
 * 型，数组元素存放子类对象的引用，最终输出car类对象所承载货物的总重量。
 * 二. Java上转型对象
 * 三. 2017年11月7日
 * 四. lv.o
 */

package txf;
//父类接口
interface ComputeWeight{
	public double computeweight();
}
//子类接口电视机
class Television implements ComputeWeight{
	private double T_weight;//每台电视机重量
	private int x; //电视机数量
	public Television(double n,int m){
		T_weight=n;
		x=m;
	}
	public double computeweight() {
		return T_weight*x;//得到卡车中电视机的总重量
	}
		
}
class Computer implements ComputeWeight{
	private double C_weight;//每台电脑重量
	private int y; //电脑数量
	public Computer(double n,int m){
		C_weight=n;
		y=m;
	}
	public double computeweight() {
		return C_weight*y;//得到卡车中电脑的重量
	}
		
}
class WashMachine implements ComputeWeight{
	private double W_weight;//每台洗衣机的重量
	private int y;//洗衣机的数量
	public WashMachine(double n,int m){
		W_weight=n;
		y=m;
	}
	public double computeweight() {
		return W_weight*y;//得到卡车中洗衣机的总重量
	}
		
}
public class Car {
	ComputeWeight [] com=new ComputeWeight[3];//声明接口类型数组及其长度
	public Car(){
		com[0]=new Television(30,10);
		com[1]=new Computer(6,20);
		com[2]=new WashMachine(100,5);
	}
	//得到卡车中电视机，电脑，洗衣机的总重量
	public void sum(){
		
		System.out.println("卡车总重量为："+(com[0].computeweight()+com[1].computeweight()+com[2].computeweight()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.sum();

	}

}