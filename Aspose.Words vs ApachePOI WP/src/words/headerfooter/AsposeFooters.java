package words.headerfooter;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.HeaderFooterType;
import com.aspose.words.PageSetup;
import com.aspose.words.ParagraphAlignment;
import com.aspose.words.Section;

public class AsposeFooters
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document();
	    DocumentBuilder builder = new DocumentBuilder(doc);

	    Section currentSection = builder.getCurrentSection();
	    PageSetup pageSetup = currentSection.getPageSetup();

	    // Specify if we want headers/footers of the first page to be different from other pages.
	    // You can also use PageSetup.OddAndEvenPagesHeaderFooter property to specify
	    // different headers/footers for odd and even pages.
	    pageSetup.setDifferentFirstPageHeaderFooter(true);

	    // --- Create header for the first page. ---
	    pageSetup.setHeaderDistance(20);
	    builder.moveToHeaderFooter(HeaderFooterType.FOOTER_FIRST);
	    builder.getParagraphFormat().setAlignment(ParagraphAlignment.CENTER);

	    // Set font properties for header text.
	    builder.getFont().setName("Arial");
	    builder.getFont().setBold(true);
	    builder.getFont().setSize(14);
	    
	    // Specify header title for the first page.
	    builder.write("(C) 2001 Aspose Pty Ltd. All rights reserved.");

	    // Save the resulting document.
	    doc.save("data/AsposeFooter.doc");
	}
}
