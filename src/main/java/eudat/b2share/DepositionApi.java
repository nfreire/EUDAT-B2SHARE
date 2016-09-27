package eudat.b2share;

import eudat.ApiException;
import eudat.ApiClient;
import eudat.Configuration;
import eudat.Pair;

import javax.ws.rs.core.GenericType;

import eudat.b2share.model.Metadata;
import eudat.b2share.model.InlineResponse200;
import eudat.b2share.model.Error;
import eudat.b2share.model.InlineResponse2001;
import java.io.File;
import eudat.b2share.model.InlineResponse201;
import eudat.b2share.model.Deposition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DepositionApi {
  private ApiClient apiClient;

  public DepositionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DepositionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Commits a deposition
   * Commits a deposition
   * @param accessToken  (required)
   * @param depositionId  (required)
   * @param metadata The metadata (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 depositionDepositionIdCommitPost(String accessToken, String depositionId, Metadata metadata) throws ApiException {
    Object localVarPostBody = metadata;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling depositionDepositionIdCommitPost");
    }
    
    // verify the required parameter 'depositionId' is set
    if (depositionId == null) {
      throw new ApiException(400, "Missing the required parameter 'depositionId' when calling depositionDepositionIdCommitPost");
    }
    
    // verify the required parameter 'metadata' is set
    if (metadata == null) {
      throw new ApiException(400, "Missing the required parameter 'metadata' when calling depositionDepositionIdCommitPost");
    }
    
    // create path and map variables
    String localVarPath = "/deposition/{deposition_id}/commit".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deposition_id" + "\\}", apiClient.escapeString(depositionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new deposition
   * Create a new deposition
   * @param accessToken  (required)
   * @param depositionId  (required)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 depositionDepositionIdFilesGet(String accessToken, String depositionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling depositionDepositionIdFilesGet");
    }
    
    // verify the required parameter 'depositionId' is set
    if (depositionId == null) {
      throw new ApiException(400, "Missing the required parameter 'depositionId' when calling depositionDepositionIdFilesGet");
    }
    
    // create path and map variables
    String localVarPath = "/deposition/{deposition_id}/files".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deposition_id" + "\\}", apiClient.escapeString(depositionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new deposition
   * Create a new deposition
   * @param accessToken  (required)
   * @param depositionId  (required)
   * @param file The avatar of the user (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 depositionDepositionIdFilesPost(String accessToken, String depositionId, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling depositionDepositionIdFilesPost");
    }
    
    // verify the required parameter 'depositionId' is set
    if (depositionId == null) {
      throw new ApiException(400, "Missing the required parameter 'depositionId' when calling depositionDepositionIdFilesPost");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling depositionDepositionIdFilesPost");
    }
    
    // create path and map variables
    String localVarPath = "/deposition/{deposition_id}/files".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "deposition_id" + "\\}", apiClient.escapeString(depositionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new deposition
   * Create a new deposition
   * @param accessToken  (required)
   * @return InlineResponse201
   * @throws ApiException if fails to make API call
   */
  public InlineResponse201 depositionsPost(String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling depositionsPost");
    }
    
    // create path and map variables
    String localVarPath = "/depositions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse201> localVarReturnType = new GenericType<InlineResponse201>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List records
   * List all the deposition records, without any filtering. 
   * @param accessToken  (required)
   * @param pageSize  (optional)
   * @param pageOffset  (optional)
   * @return List<Deposition>
   * @throws ApiException if fails to make API call
   */
  public List<Deposition> recordsGet(String accessToken, Double pageSize, Double pageOffset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling recordsGet");
    }
    
    // create path and map variables
    String localVarPath = "/records".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_offset", pageOffset));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Deposition>> localVarReturnType = new GenericType<List<Deposition>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
