package model;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Http_test {

	public static void main(String[] args) throws URISyntaxException, IOException {

		Desktop desktop = Desktop.getDesktop();   
		URI uri = new URI("http://05.xiao2013-xyx-pcgame.guo26.com:8090/yxdown.com_CS16_chs.rar"); 
		desktop.browse(uri);

	}

}
