
public class Etudiant extends Personne {
private int matriculEtudiant;

public int getMatriculEtudiant() {
	return matriculEtudiant;
}

public void setMatriculEtudiant(int matriculEtudiant) {
	this.matriculEtudiant = matriculEtudiant;
}

@Override
	public void CalculPrime() {
		// TODO Auto-generated method stub
	int PrimeFixe=50;
	System.out.println("la prime est"+PrimeFixe+"fcfa" );
	
	
		super.CalculPrime();
	}
}
