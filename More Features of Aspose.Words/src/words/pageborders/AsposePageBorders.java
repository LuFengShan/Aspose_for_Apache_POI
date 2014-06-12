/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 */

package words.pageborders;

import com.aspose.words.ConvertUtil;
import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.PageSetup;

public class AsposePageBorders
{
	public static void main(String[] args) throws Exception
	{
		Document doc = new Document();
		DocumentBuilder builder = new DocumentBuilder(doc);

		PageSetup pageSetup = builder.getPageSetup();
		pageSetup.setTopMargin(ConvertUtil.inchToPoint(0.5));
		pageSetup.setBottomMargin(ConvertUtil.inchToPoint(0.5));
		pageSetup.setLeftMargin(ConvertUtil.inchToPoint(0.5));
		pageSetup.setRightMargin(ConvertUtil.inchToPoint(0.5));
		pageSetup.setHeaderDistance(ConvertUtil.inchToPoint(0.2));
		pageSetup.setFooterDistance(ConvertUtil.inchToPoint(0.2));
		
		doc.save("data/AsposePageBorders.docx");
	}
}
