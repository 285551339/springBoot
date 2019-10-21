/*
package cn.abel.springBoot;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.springframework.data.elasticsearch.core.facet.FacetRequest;
import org.springframework.data.elasticsearch.core.query.IndexBoost;
import org.springframework.data.elasticsearch.core.query.ScriptField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

*/
/**
* @Description:
* @Author: zc
* @CreateDate: 2019/5/8 16:04
* @Remark: 
* @Version: 1.0
*//*

public class NativeSearchQuery extends AbstractQuery implements SearchQuery {

    private QueryBuilder query;
    private QueryBuilder filter;
    private List<SortBuilder> sorts;
    private final List<ScriptField> scriptFields = new ArrayList<ScriptField>();
    private List<FacetRequest> facets;
    private List<AbstractAggregationBuilder> aggregations;
   // private HighlightBuilder.Field[] highlightFields;
    private List<IndexBoost> indicesBoost;


    public NativeSearchQuery(QueryBuilder query) {
        this.query = query;
    }

    public NativeSearchQuery(QueryBuilder query, QueryBuilder filter) {
        this.query = query;
        this.filter = filter;
    }

    public NativeSearchQuery(QueryBuilder query, QueryBuilder filter, List<SortBuilder> sorts) {
        this.query = query;
        this.filter = filter;
        this.sorts = sorts;
    }

   */
/* public NativeSearchQuery(QueryBuilder query, QueryBuilder filter, List<SortBuilder> sorts, HighlightBuilder.Field[] highlightFields) {
        this.query = query;
        this.filter = filter;
        this.sorts = sorts;
        this.highlightFields = highlightFields;
    }*//*


    public QueryBuilder getQuery() {
        return query;
    }

    public QueryBuilder getFilter() {
        return filter;
    }

    public List<SortBuilder> getElasticsearchSorts() {
        return sorts;
    }

  */
/*  @Override
    public HighlightBuilder.Field[] getHighlightFields() {
        return highlightFields;
    }*//*


    @Override
    public List<ScriptField> getScriptFields() { return scriptFields; }

    public void setScriptFields(List<ScriptField> scriptFields) {
        this.scriptFields.addAll(scriptFields);
    }

    public void addScriptField(ScriptField... scriptField) {
        scriptFields.addAll(Arrays.asList(scriptField));
    }

    public void addFacet(FacetRequest facetRequest) {
        if (facets == null) {
            facets = new ArrayList<FacetRequest>();
        }
        facets.add(facetRequest);
    }

    public void setFacets(List<FacetRequest> facets) {
        this.facets = facets;
    }

    @Override
    public List<FacetRequest> getFacets() {
        return facets;
    }

    @Override
    public List<AbstractAggregationBuilder> getAggregations() {
        return aggregations;
    }


    public void addAggregation(AbstractAggregationBuilder aggregationBuilder) {
        if (aggregations == null) {
            aggregations = new ArrayList<AbstractAggregationBuilder>();
        }
        aggregations.add(aggregationBuilder);
    }

    public void setAggregations(List<AbstractAggregationBuilder> aggregations) {
        this.aggregations = aggregations;
    }

    @Override
    public List<IndexBoost> getIndicesBoost() {
        return indicesBoost;
    }

    public void setIndicesBoost(List<IndexBoost> indicesBoost) {
        this.indicesBoost = indicesBoost;
    }

}
*/
