package net.entelijan.tryout;

import java.io.InputStream;
import java.util.Random;

import ddf.minim.AudioOutput;
import ddf.minim.Minim;
import ddf.minim.javasound.JSMinim;
import ddf.minim.spi.MinimServiceProvider;

public class FirstTryout
{

	public static void main(String[] args) throws InterruptedException
	{
		Random ran = new Random();
		
		FileLoader fileLoader = new FileLoader();
		MinimServiceProvider serviceProvider = new JSMinim( fileLoader );
		System.out.println( "Created a service provider: " + serviceProvider );
		Minim minim = new Minim( serviceProvider );
		System.out.println( "Created minim: " + minim );

		AudioOutput out = minim.getLineOut();
		System.out.println( "Created audio output: " + out );

		out.setTempo( 60 );

		out.pauseNotes();
		for ( float i = 0; i < 10; i += 1 )
		{
			out.playNote( i, 1.4f, 97.99f + ran.nextFloat() * 5f );
			out.playNote( i + 0.5f, 0.4f, 123.47f + ran.nextFloat() * 20f);
		}

		out.resumeNotes();
		System.out.println( "resumed notes" );

		Thread.sleep( 10000 );
		out.close();
		System.out.println( "Closed after 10s" );

	}

	public static class FileLoader
	{

		public String sketchPath(String fileName)
		{
			throw new IllegalStateException( "Not yet implemented" );
		}

		public InputStream createInput(String fileName)
		{
			throw new IllegalStateException( "Not yet implemented" );
		}

	}
}
