package net.entelijan.tryout;

import java.io.InputStream;

import ddf.minim.Minim;
import ddf.minim.javasound.JSMinim;
import ddf.minim.spi.MinimServiceProvider;

public class FirstTryout
{

	public static void main(String[] args)
	{
		FileLoader fileLoader = new FileLoader();
		MinimServiceProvider serviceProvider = new JSMinim( fileLoader );
		System.out.println( "Created a service provider: " + serviceProvider );
		Minim minim  = new Minim( serviceProvider );
		System.out.println( "Created minim: " + minim );
	}

	public static class FileLoader
	{

		public String sketchPath(String fileName)
		{
			throw new IllegalStateException( "Not yet implemented" );
		}
		public InputStream createInput( String fileName )
		{
			throw new IllegalStateException( "Not yet implemented" );
		}

	}
}
