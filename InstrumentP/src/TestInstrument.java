
public class TestInstrument {

	public static void main(String[] args) {
			Instrument objArr[] = new Instrument[10];
			
			for(int i = 0; i < 10; ++i)
			{
				int rnd = (int)Math.round(Math.random()*2);
				switch(rnd)
				{
					case 0:
						objArr[i] = new Piano();
						break;
					
					case 1:
						objArr[i] = new Flute();
						break;
						
					case 2:
						objArr[i] = new Guitar();
						break;
					
					default:
						objArr[i] = new Piano();
				}
			}
			
			for(int i = 0; i < 10; ++i)
			{
				if ( objArr[i] instanceof Piano)
				{
					System.out.println("An instance of Piano...");
				}
				else if ( objArr[i] instanceof Flute)
				{
					System.out.println("An instance of Flute...");
				}
				else if ( objArr[i] instanceof Guitar)
				{
					System.out.println("An instance of Guitar...");
				}
				objArr[i].play();
			}
	}

}
