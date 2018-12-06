package soundsystem;


public class SgtPeppers implements CompactDisc{
	private String artist="张学友";
	private String title="一千个伤心的理由";
	@Override
	public void play() {
		System.out.println(artist+"正在演唱"+title);
		
	}
	
}
