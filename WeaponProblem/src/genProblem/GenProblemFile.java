package genProblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import algorithm.Attribute;

public class GenProblemFile implements GenProblemInter {

	private BufferedReader br;
	private Attribute AT;
	
	public GenProblemFile(Attribute AT) {
		this.AT = AT;		
	}

	// read the value of target from the file.
	@Override
	public void genTarVal(int[] arr) {
		// TODO Auto-generated method stub

		try {
			br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\tarVal\\tarVal"+AT.getArrX()+"_"+AT.getArrY()+".txt"));
			int i = 0;
			for (String s : br.readLine().split(" ")) {

				arr[i] = Integer.parseInt(s);
				i++;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//read the probability of weapon attack to target from the file.
	@Override
	public void genAtkPro(double[][] arr) {
		// TODO Auto-generated method stub

		try {
			br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\atkPro\\atkPro"+AT.getArrX()+"_"+AT.getArrY()+".txt"));
			int i = 0;
			int j = 0;
			String line;
			while((line = br.readLine()) !=null){
				for (String s : line.split(" ")) {

					arr[i][j] = Double.parseDouble(s);
					j++;				
				}	
				j=0;
				i++;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
