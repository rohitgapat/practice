package practice;

public class CheckPrime {

	public boolean checkPrime(int num) {
		if(num<=1) {
			return false;
		}
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				
				return false; 
				
			}
		}
		return true;
	}
	
	public static void main (String [] arg) {
		CheckPrime c1= new CheckPrime();
		System.out.println(c1.checkPrime(23));
	}
}
/*
 * <link href=
 * "https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
 * rel="stylesheet" integrity=
 * "sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
 * crossorigin="anonymous"> <script src=
 * "https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
 * integrity=
 * "sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
 * crossorigin="anonymous"></script> <script src=
 * "https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
 * integrity=
 * "sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
 * crossorigin="anonymous"></script> <script
 * src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
 * integrity=
 * "sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
 * crossorigin="anonymous"></script> aut-ysck-oam
 */