/*
package cn.abel.springBoot;

import org.elasticsearch.action.ListenableActionFuture;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
//import org.elasticsearch.search.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.ResultsExtractor;
import org.springframework.data.elasticsearch.core.facet.FacetRequest;
import org.springframework.data.elasticsearch.core.query.IndexBoost;
import org.springframework.data.elasticsearch.core.query.ScriptField;
import org.springframework.data.elasticsearch.core.query.SourceFilter;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;

*/
/**
* @Description: 改写spring-data-elasticsearch的查询模板,加上Preference参数配置
* @Author: zc
* @CreateDate: 2019/5/8 14:58
* @Remark:
* @Version: 1.0
*//*

@Component
public class MyElasticsearchTemplate{

    private String searchTimeout;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    public String getSearchTimeout() {
        return searchTimeout;
    }

    public void setSearchTimeout(String searchTimeout) {
        this.searchTimeout = searchTimeout;
    }

    public ElasticsearchTemplate getElasticsearchTemplate() {
        return elasticsearchTemplate;
    }

    public void setElasticsearchTemplate(ElasticsearchTemplate elasticsearchTemplate) {
        this.elasticsearchTemplate = elasticsearchTemplate;
    }

    public <T> T query(SearchQuery query, ResultsExtractor<T> resultsExtractor) {
        SearchResponse response = doSearch(prepareSearch(query), query);
        return resultsExtractor.extract(response);
    }

    private SearchResponse doSearch(SearchRequestBuilder searchRequest, SearchQuery searchQuery) {
        if (searchQuery.getFilter() != null) {
            searchRequest.setPostFilter(searchQuery.getFilter());
        }

        if (!isEmpty(searchQuery.getElasticsearchSorts())) {
            for (SortBuilder sort : searchQuery.getElasticsearchSorts()) {
                searchRequest.addSort(sort);
            }
        }

      */
/*  if (!searchQuery.getScriptFields().isEmpty()) {
            searchRequest.addField("_source");
            for (ScriptField scriptedField : searchQuery.getScriptFields()) {
                searchRequest.addScriptField(scriptedField.fieldName(), scriptedField.script());
            }
        }

        if (searchQuery.getHighlightFields() != null) {
            for (HighlightBuilder.Field highlightField : searchQuery.getHighlightFields()) {
                searchRequest.addHighlightedField(highlightField);
            }
        }*//*


        if (!isEmpty(searchQuery.getIndicesBoost())) {
            for (IndexBoost indexBoost : searchQuery.getIndicesBoost()) {
                searchRequest.addIndexBoost(indexBoost.getIndexName(), indexBoost.getBoost());
            }
        }

        if (!isEmpty(searchQuery.getAggregations())) {
            for (AbstractAggregationBuilder aggregationBuilder : searchQuery.getAggregations()) {
                searchRequest.addAggregation(aggregationBuilder);
            }
        }

        if (!isEmpty(searchQuery.getFacets())) {
            for (FacetRequest aggregatedFacet : searchQuery.getFacets()) {
                searchRequest.addAggregation(aggregatedFacet.getFacet());
            }
        }
        return getSearchResponse(searchRequest.setQuery(searchQuery.getQuery()).execute());
    }

    private SearchResponse getSearchResponse(ListenableActionFuture<SearchResponse> response) {
        return searchTimeout == null ? response.actionGet() : response.actionGet(searchTimeout);
    }

    private SearchRequestBuilder prepareSearch(Query query) {
        Assert.notNull(query.getIndices(), "No index defined for Query");
        Assert.notNull(query.getTypes(), "No type defined for Query");

        int startRecord = 0;
        SearchRequestBuilder searchRequestBuilder = elasticsearchTemplate.getClient().prepareSearch(toArray(query.getIndices()))
                .setSearchType(query.getSearchType()).setTypes(toArray(query.getTypes())).setPreference(query.getPreference().type());  //加上Preference参数，

        if (query.getSourceFilter() != null) {
            SourceFilter sourceFilter = query.getSourceFilter();
            searchRequestBuilder.setFetchSource(sourceFilter.getIncludes(), sourceFilter.getExcludes());
        }

        if (query.getPageable() != null) {
            startRecord = query.getPageable().getPageNumber() * query.getPageable().getPageSize();
            searchRequestBuilder.setSize(query.getPageable().getPageSize());
        }
        searchRequestBuilder.setFrom(startRecord);

       */
/* if (!query.getFields().isEmpty()) {
            searchRequestBuilder.addFields(toArray(query.getFields()));
        }*//*


        if (query.getSort() != null) {
            for (Sort.Order order : query.getSort()) {
                searchRequestBuilder.addSort(order.getProperty(), order.getDirection() == Sort.Direction.DESC ? SortOrder.DESC
                        : SortOrder.ASC);
            }
        }

        if (query.getMinScore() > 0) {
            searchRequestBuilder.setMinScore(query.getMinScore());
        }
        return searchRequestBuilder;
    }

    private static String[] toArray(List<String> values) {
        String[] valuesAsArray = new String[values.size()];
        return values.toArray(valuesAsArray);
    }
}
*/
