import java.util.Random;
public class TestMedicine {

	public static void main(String[] args) {
			
		Medicine objArr[] = new Medicine[10];
		
		for(int i = 0; i < 10; ++i)
		{
			int rnd = (int)Math.round(Math.random()*2);
			switch(rnd)
			{
				case 0:
					objArr[i] = new Tablet("RanBaxy", "Calcutta", "Crocin");
					break;
				
				case 1:
					objArr[i] = new Syrup("Glaxo", "Mumbai", "Benedryl");
					break;
					
				case 2:
					objArr[i] = new Ointment("Himalaya", "Bangalore", "Vicco");
					break;
				
				default:
					objArr[i] = new Tablet("Cipla", "Rajasthan", "Brufen");
			}
		}
		
		for(int i = 0; i < 10; ++i)
		{
			if ( objArr[i] != null )
				objArr[i].displayLabel();
		}
	}
}
