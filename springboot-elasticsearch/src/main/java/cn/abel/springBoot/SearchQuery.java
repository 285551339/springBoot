package cn.abel.springBoot;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
//import org.elasticsearch.search.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.springframework.data.elasticsearch.core.facet.FacetRequest;
import org.springframework.data.elasticsearch.core.query.IndexBoost;
import org.springframework.data.elasticsearch.core.query.ScriptField;

import java.util.List;

public interface SearchQuery extends Query {

    QueryBuilder getQuery();

    QueryBuilder getFilter();

    List<SortBuilder> getElasticsearchSorts();

    @Deprecated
    List<FacetRequest> getFacets();

    List<AbstractAggregationBuilder> getAggregations();

   // HighlightBuilder.Field[] getHighlightFields();

    List<IndexBoost> getIndicesBoost();

    List<ScriptField> getScriptFields();
}
