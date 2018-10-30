import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner cin=new Scanner(System.in);
float m=0.f,n=0.00f,d=0.00f,k;
while(cin.hasNext()){
	
	String s=cin.next();
	char x=s.charAt(0);
	//Shape c=new Shape();	
	if(x=='J')
	{	
	m=cin.nextFloat();
	n=cin.nextFloat();
	Shape juxing=new Juxing(m,n);
	System.out.println("矩形周长："+String.format("%.2f",juxing.zhouchan()) +"，面积："+String.format("%.2f",juxing.mianji()));
	}
	if(x=='S')
	{
	m=cin.nextFloat();
	n=cin.nextFloat();
	d=cin.nextFloat();
	Shape shanjiao=new Shanjiao(m,n,d);
	System.out.println("三角形周长："+String.format("%.2f",shanjiao.zhouchan())+"，面积："+String.format("%.2f",Math.sqrt(shanjiao.mianji()*(shanjiao.mianji()-m)*(shanjiao.mianji()-n)*(shanjiao.mianji()-d))));
	}
	if(x=='Y')
	{
	m=cin.nextFloat();
	Shape yuanxin=new Yuanxin(m);
	System.out.println("圆形周长："+String.format("%.2f",yuanxin.zhouchan()*Math.PI)+"，面积："+String.format("%.2f",yuanxin.mianji()*Math.PI));
	}
	if(x=='T')
	{
	m=cin.nextFloat();
	n=cin.nextFloat();
	Shape tuoyuan=new Tuoyuan(m,n);
	System.out.println("椭圆周长："+String.format("%.2f",tuoyuan.zhouchan()*Math.PI+4*(m-n))+"，面积："+String.format("%.2f",tuoyuan.mianji()*Math.PI));
	}
	}
}
	}
abstract class Shape{
	public abstract float mianji();
	public abstract float zhouchan();
}
class Juxing extends Shape{
	private float a,b;
public Juxing(float a,float b){
	this.setA(a);
	this.setB(b);
}
public float mianji(){
	return a*b;
}
public float zhouchan(){
	return 2*(a+b);
}
	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}	
}
class Shanjiao extends Shape{
	private float a,b,c;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}
	public Shanjiao(float a,float b,float c){
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}
	public float mianji(){
		return (a+b+c)/2;
	}
	public float zhouchan(){
		return a+b+c;
	}
}

class Yuanxin extends Shape{
	private float a;
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public Yuanxin(float a){
		this.setA(a);
	}
	public float mianji(){
		return a*a;
	}
	public float zhouchan(){
		return a*2;
	}
}
class Tuoyuan extends Shape{
	private float a,b;
	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
	public Tuoyuan(float a,float b){
		//super();
		this.setA(a);
		this.setB(b);
	}
	public float mianji(){
		return a*b;
	}
	public float zhouchan(){
		return 2*b;
	}
}