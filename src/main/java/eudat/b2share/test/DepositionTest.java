package eudat.b2share.test;

import java.io.File;

import eudat.ApiException;
import eudat.JSON;
import eudat.b2share.DepositionApi;
import eudat.b2share.model.InlineResponse200;
import eudat.b2share.model.InlineResponse2001;
import eudat.b2share.model.InlineResponse201;
import eudat.b2share.model.Metadata;
import eudat.b2share.model.Metadata.LingResourceTypeEnum;

public class DepositionTest {

	
	public static void main(String[] args) throws Exception {
		DepositionApi b2shareApi=new DepositionApi();
		b2shareApi.getApiClient().setDebugging(true);
		HttpsUtil.initSslTrustingHostVerifier(b2shareApi);		
		
		String apiToken=args[0];
		InlineResponse201 depositionsPost = b2shareApi.depositionsPost(apiToken);
		System.out.println(depositionsPost.getDepositId());
		System.out.println(depositionsPost.getMessage());
		System.out.println(depositionsPost.getLocation());
		String fepId=depositionsPost.getDepositId();
		InlineResponse200 depositiondepositionIdFilesPost = b2shareApi.depositionDepositionIdFilesPost(apiToken, fepId, new File("LICENSE"));
		System.out.println(
		depositiondepositionIdFilesPost.getMessage()
		);
		
		InlineResponse2001 depositionDepositionIdFilesGet = b2shareApi.depositionDepositionIdFilesGet(apiToken, fepId);
		System.out.println( depositionDepositionIdFilesGet.getFiles()) ;
		
		Metadata md=new Metadata();
//		md.getDiscipline().add("Humanities");
		md.getDiscipline().add("1 / Humanities / Humanities");
		md.getCreator().add("Library x");
		md.getCreator().add("Europeana Foundation");
		md.description("Newspaper of...")
//		.domain("Linguistics")
		.domain("generic")
		.publicationDate("1900")//publication_date
		.contactEmail("nfreire@gmail.com")
//		.email("nfreire@gmail.com")
		.openAccess(true)
		.licence("Public Domain Dedication (CC Zero)")
		.title("Fullect od Newspaper xpto")
		.description("Newspaper")
//		.languageCode("pol")
		.getLingResourceType().add(LingResourceTypeEnum.TEXT)
		;
		
		String mdAsString = new JSON().getContext(Metadata.class).writeValueAsString(md);
		
		System.out.println(md);
		System.out.println(mdAsString);
		InlineResponse200 depositionDepositionIdCommitPost = b2shareApi.depositionDepositionIdCommitPost(apiToken, fepId, md);
		System.out.println(depositionDepositionIdCommitPost);
	}
	
	
	
}
