
public class employer  extends Personne {
	private int matriculemployer;

	public int getMatriculemployer() {
		return matriculemployer;
	}

	public void setMatriculemployer(int matriculemployer) {
		this.matriculemployer = matriculemployer;
	}
	
	@Override
	public void CalculPrime() {
		// TODO Auto-generated method stub
		
		int PrimeFixe=50;
		int Salaire = 200;
		int Salairetotal;
		
		Salairetotal= PrimeFixe + Salaire ;
		System.out.print("salaire est de :"+Salairetotal+"fcfa");
		
		super.CalculPrime();
	}

	public void setMatriculEtudiant(int i) {
		// TODO Auto-generated method stub
		
	} 
}
