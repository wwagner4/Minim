package net.entelijan.tryout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import ddf.minim.javasound.JSMinim;
import ddf.minim.spi.MinimServiceProvider;

public class FirstTryout
{

	public static void main(String[] args)
	{
		Object fileLoader = new FileLoader();
		MinimServiceProvider serviceProvider = new JSMinim( fileLoader );
		System.out.println( "Created a service provider: " + serviceProvider );
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
