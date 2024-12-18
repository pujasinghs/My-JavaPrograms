package My_Package;

public class fact {
    
	/*int factorial (int n){
		if(n==0)
          return 1;
		return n*(factorial(--n));
	}*/
	public static void main(String[] args) {
		Person father=new Person("Dinesh","PujaFather",929929299292l);
		Person mother=new Person("Nirmala","PujaMother",929929299292l);
		Person puja = new Person("puja","Pujaaddress",8288299292l,father,mother);
	/*	Person father=new Person("Dinesh","PujaFather",929929299292l);
		Person mother=new Person("Nirmala","PujaMother",929929299292l);
		puja.setFather(father);
		puja.setMother(mother);*/
		System.out.println(puja.getFather().getName());
		System.out.println(puja.getMother().getName());

	}

}
