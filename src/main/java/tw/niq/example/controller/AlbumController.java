package tw.niq.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.niq.example.model.AlbumResponseModel;

@RestController
@RequestMapping("/albums")
public class AlbumController {

	@GetMapping
	public List<AlbumResponseModel> getAlbums() {
		
		AlbumResponseModel album1 = new AlbumResponseModel();
		
		album1.setAlbumId("1");
		album1.setUserId("1");
		album1.setAlbumTitle("Album 1 Title");
		album1.setAlbumDescription("Album 1 Description");
		album1.setAlbumUrl("Album 1 URL");
		
		AlbumResponseModel album2 = new AlbumResponseModel();
		
		album2.setAlbumId("2");
		album2.setUserId("2");
		album2.setAlbumTitle("Album 2 Title");
		album2.setAlbumDescription("Album 2 Description");
		album2.setAlbumUrl("Album 2 URL");
		
		return Arrays.asList(album1, album2);
	}
	
}
