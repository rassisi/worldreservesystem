package org.eclipse.rcpl.application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;

public class svg2png {
	public static void main(String[] args) throws Exception {
		// Step -1: We read the input SVG document into Transcoder Input
		// We use Java NIO for this purpose
		String svg_URI_input = new File("c:/TEMP/anchor.svg").toURI()
				.toString();

		// Paths.get("chessboard.svg").toUri().toURL()
		// .toString();
		TranscoderInput input_svg_image = new TranscoderInput(svg_URI_input);
		// Step-2: Define OutputStream to PNG Image and attach to
		// TranscoderOutput
		OutputStream png_ostream = new FileOutputStream("c:/TEMP/anchor.png");
		TranscoderOutput output_png_image = new TranscoderOutput(png_ostream);
		// Step-3: Create PNGTranscoder and define hints if required
		PNGTranscoder my_converter = new PNGTranscoder();
		// Step-4: Convert and Write output

		// try {
		my_converter.transcode(input_svg_image, output_png_image);
		// } catch (Exception ex) {
		// System.out. println();
		// }
		// Step 5- close / flush Output Stream
		png_ostream.flush();
		png_ostream.close();
	}
}
