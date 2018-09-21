package Computer;

public class Main {
	public static void main(String[] args) {
		Computer cp=new Computer ();

		//motherBoard details
		cp.mb=new MotherBoard();
		cp.mb.id=123;
		cp.mb.qualityRating=1;
		cp.mb.warrentyPeriod=1;
	//motherboard bill
	
		cp.mb.bill=new Bill();
		cp.mb.bill.billNo=1111;
		cp.mb.bill.basePrice=23460;
		cp.mb.bill.serviceTax=214;
		cp.mb.bill.transportTax=213;
		cp.mb.bill.stateTax=432;
		cp.mb.bill.centralTax=567;
		cp.mb.bill.finalPrice=cp.mb.bill.basePrice+cp.mb.bill.serviceTax+cp.mb.bill.transportTax+cp.mb.bill.stateTax+cp.mb.bill.centralTax;
	
		//motherboard company
		
		cp.mb.company=new Company();
		
		cp.mb.company.id=100;
		cp.mb.company.name="AOC";
		cp.mb.company.email="aoc123@aoc.in";
		
		//motherBoard company address details
		cp.mb.company.add=new Address();
		
		
		cp.mb.company.add.pincode=500014;
		cp.mb.company.add.country="india";
		cp.mb.company.add.city="hyderabad";
		cp.mb.company.add.State="Telangana";
		cp.mb.company.add.Street="gangasthan";
		
		
		//Computer keyboard
		cp.kb=new KeyBoard();
		
		cp.kb.id=124;
		cp.kb.qualityRating=2;
		cp.kb.warrentyPeriod=1;
		
		//keyboard bill
		cp.kb.bill=new Bill();
		
		cp.kb.bill.billNo=1112;
		cp.kb.bill.basePrice=25000;
		cp.kb.bill.serviceTax=211;
		cp.kb.bill.transportTax=222;
		cp.kb.bill.stateTax=121;
		cp.kb.bill.centralTax=225;
		cp.kb.bill.finalPrice=cp.kb.bill.basePrice+cp.kb.bill.serviceTax+cp.kb.bill.transportTax+cp.kb.bill.stateTax+cp.kb.bill.centralTax;
		
		//keyboard company
		cp.kb.company =new Company();
		cp.kb.company.id=101;
		cp.kb.company.name="fronttech";
		cp.kb.company.email="fronttech12@ft.in";
		
		//keyboard company address
		cp.kb.company.add=new Address();
		
		cp.kb.company.add.pincode=200000;
		cp.kb.company.add.country="INDIA";
		cp.kb.company.add.city="mumbai";
		cp.kb.company.add.State="maharastra";
		cp.kb.company.add.Street="abc";
		
		//CPU
		cp.cpu=new CPU();
		
		cp.cpu.id=103;
		cp.cpu.qualityRating=2;
		cp.cpu.warrentyPeriod=1;
		cp.cpu.speed="2.4GHz";
		cp.cpu.type="i3";
		
		//CPU bill
		cp.cpu.bill=new Bill();
		
		cp.cpu.bill.billNo=1113;
		cp.cpu.bill.basePrice=30000;
		cp.cpu.bill.serviceTax=123;
		cp.cpu.bill.transportTax=321;
		cp.cpu.bill.stateTax=98;
		cp.cpu.bill.centralTax=432;
		cp.cpu.bill.finalPrice=cp.cpu.bill.basePrice+cp.cpu.bill.serviceTax+cp.cpu.bill.transportTax+cp.cpu.bill.stateTax+cp.cpu.bill.centralTax;
		
		//CPU company
		cp.cpu.company=new Company();
		
		cp.cpu.company.id=102;
		cp.cpu.company.name="zebion";
		cp.cpu.company.email="zebion@zb.in";
		
		//CPU company address
		cp.cpu.company.add=new Address();
		
		cp.cpu.company.add.pincode=500017;
		cp.cpu.company.add.country="INDIA";
		cp.cpu.company.add.city="agra";
		cp.cpu.company.add.State="uttar pradesh";
		cp.cpu.company.add.Street="dulapally";
		
		//MOUSE
		cp.m=new Mouse();
		cp.m.id=121;
		cp.m.qualityRating=3;
		cp.m.warrentyPeriod=2;
		cp.m.type="wired";
		
		//Mouse bill
		cp.m.bill=new Bill();
		
		cp.m.bill.billNo=1114;
		cp.m.bill.basePrice=900;
		cp.m.bill.serviceTax=10;
		cp.m.bill.transportTax=9;
		cp.m.bill.stateTax=7;
		cp.m.bill.centralTax=1;
		cp.cpu.bill.finalPrice=cp.m.bill.basePrice+cp.m.bill.serviceTax+cp.m.bill.transportTax+cp.m.bill.stateTax+cp.m.bill.centralTax;
		
		//mouse company
		cp.m.company=new Company();
		
		cp.m.company.id=103;
		cp.m.company.name="circle";
		cp.m.company.email="circle@ci.in";
		
		//mouse company address
		cp.m.company.add=new Address();
		
		cp.m.company.add.pincode=500100;
		cp.m.company.add.country="INDIA";
		cp.m.company.add.city="hyd";
		cp.m.company.add.State="telangana";
		cp.m.company.add.Street="gandi";
		
		//RAM
		cp.ram=new RAM();
		
		cp.ram.id=1278;
		cp.ram.qualityRating=5;
		cp.ram.warrentyPeriod=3;
		cp.ram.capacity="4GB";
	
		//RAM Bill
		cp.ram.bill=new Bill();
		
		cp.ram.bill.billNo=1115;
		cp.ram.bill.basePrice=2000;
		cp.ram.bill.serviceTax=23;
		cp.ram.bill.transportTax=24;
		cp.ram.bill.stateTax=2;
		cp.ram.bill.centralTax=12;
		cp.ram.bill.finalPrice=cp.ram.bill.basePrice+cp.ram.bill.serviceTax+cp.ram.bill.transportTax+cp.ram.bill.stateTax+cp.ram.bill.centralTax;
		
		//ram company
		cp.ram.company=new Company();
		cp.ram.company.id=104;
		cp.ram.company.name="mnb";
		cp.ram.company.email="amnb@mn.in";
		
		//ram company address
		cp.ram.company.add=new Address();
		cp.ram.company.add.pincode=654321;
		cp.ram.company.add.country="INDIA";
		cp.ram.company.add.city="hyd";
		cp.ram.company.add.State="tel";
		cp.ram.company.add.Street="xyz";
		
		//Monitor
		cp.mon=new Monitor();
		
		cp.mon.id=1233;
		cp.mon.qualityRating=3;
		cp.mon.warrentyPeriod=2;
		
		//monitor bill
		cp.mon.bill=new Bill();
		cp.mon.bill.billNo=1116;
		cp.mon.bill.basePrice=10000;
		cp.mon.bill.serviceTax=12;
		cp.mon.bill.transportTax=32;
		cp.mon.bill.stateTax=21;
		cp.mon.bill.centralTax=54;
		cp.mon.bill.finalPrice=cp.mon.bill.basePrice+cp.mon.bill.serviceTax+cp.mon.bill.transportTax+cp.mon.bill.stateTax+cp.mon.bill.centralTax;
		//monitor company 
		cp.mon.company=new Company();
		cp.mon.company.id=105;
		cp.mon.company.name="senseeye";
		cp.mon.company.email="senseeye@er.in";
		
		
		//monitor Address
		cp.mon.company.add=new Address();
		cp.mon.company.add.pincode=456789;
		cp.mon.company.add.country="india";
		cp.mon.company.add.city="hyd";
		cp.mon.company.add.State="andhrapradesh";
		cp.mon.company.add.Street="mno";
		
	}
}
