package soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc {

	private String title;
	private String singer;
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public BlankDisc(
						@Value("#{systemProperties[title]}") String title,
						@Value("#{systemProperties[singer]}") String singer)
	{
		this.title=title;
		this.singer=singer;
	}
	
	public BlankDisc() {
		
	}
	
	@Override
	public void play() {
		
		System.out.println(singer+"ÕýÔÚÑÝ³ª"+title);
	}

}
