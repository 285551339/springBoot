package cn.abel.springBoot;

import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.cluster.routing.Preference;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
//import org.elasticsearch.search.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.facet.FacetRequest;
import org.springframework.data.elasticsearch.core.query.IndexBoost;
import org.springframework.data.elasticsearch.core.query.ScriptField;
import org.springframework.data.elasticsearch.core.query.SourceFilter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;

/**
* @Description: 重写了spring-data-elasticsearch的NativeSearchQueryBuilder
* @Author: zc
* @CreateDate: 2019/5/8 15:06
* @Remark:
* @Version: 1.0
*/
public class NativeSearchQueryBuilder {

    private QueryBuilder queryBuilder;
    private QueryBuilder filterBuilder;
    private List<ScriptField> scriptFields = new ArrayList<ScriptField>();
    private List<SortBuilder> sortBuilders = new ArrayList<SortBuilder>();
    private List<FacetRequest> facetRequests = new ArrayList<FacetRequest>();
    private List<AbstractAggregationBuilder> aggregationBuilders = new ArrayList<AbstractAggregationBuilder>();
   // private HighlightBuilder.Field[] highlightFields;
    private Pageable pageable;
    private String[] indices;
    private String[] types;
    private String[] fields;
    private SourceFilter sourceFilter;
    private List<IndexBoost> indicesBoost;
    private float minScore;
    private Collection<String> ids;
    private String route;
    private SearchType searchType;
    private Preference preference; //新增路由方式

    public NativeSearchQueryBuilder withQuery(QueryBuilder queryBuilder) {
        this.queryBuilder = queryBuilder;
        return this;
    }

    public NativeSearchQueryBuilder withFilter(QueryBuilder filterBuilder) {
        this.filterBuilder = filterBuilder;
        return this;
    }

    public NativeSearchQueryBuilder withSort(SortBuilder sortBuilder) {
        this.sortBuilders.add(sortBuilder);
        return this;
    }

    public NativeSearchQueryBuilder withScriptField(ScriptField scriptField) {
        this.scriptFields.add(scriptField);
        return this;
    }

    public NativeSearchQueryBuilder addAggregation(AbstractAggregationBuilder aggregationBuilder) {
        this.aggregationBuilders.add(aggregationBuilder);
        return this;
    }

    public NativeSearchQueryBuilder withFacet(FacetRequest facetRequest) {
        facetRequests.add(facetRequest);
        return this;
    }

    /*public NativeSearchQueryBuilder withHighlightFields(HighlightBuilder.Field... highlightFields) {
        this.highlightFields = highlightFields;
        return this;
    }*/

    public NativeSearchQueryBuilder withIndicesBoost(List<IndexBoost> indicesBoost) {
        this.indicesBoost = indicesBoost;
        return this;
    }

    public NativeSearchQueryBuilder withPageable(Pageable pageable) {
        this.pageable = pageable;
        return this;
    }

    public NativeSearchQueryBuilder withIndices(String... indices) {
        this.indices = indices;
        return this;
    }

    public NativeSearchQueryBuilder withTypes(String... types) {
        this.types = types;
        return this;
    }

    public NativeSearchQueryBuilder withFields(String... fields) {
        this.fields = fields;
        return this;
    }

    public NativeSearchQueryBuilder withSourceFilter(SourceFilter sourceFilter) {
        this.sourceFilter = sourceFilter;
        return this;
    }

    public NativeSearchQueryBuilder withMinScore(float minScore) {
        this.minScore = minScore;
        return this;
    }

    public NativeSearchQueryBuilder withIds(Collection<String> ids) {
        this.ids = ids;
        return this;
    }

    public NativeSearchQueryBuilder withRoute(String route) {
        this.route = route;
        return this;
    }

    public NativeSearchQueryBuilder withSearchType(SearchType searchType) {
        this.searchType = searchType;
        return this;
    }

    public NativeSearchQueryBuilder withPreference(Preference preference) {
        this.preference = preference;
        return this;
    }

   /* public NativeSearchQuery build() {
        NativeSearchQuery nativeSearchQuery = new NativeSearchQuery(queryBuilder, filterBuilder, sortBuilders, highlightFields);
        if (pageable != null) {
            nativeSearchQuery.setPageable(pageable);
        }

        if (indices != null) {
            nativeSearchQuery.addIndices(indices);
        }

        if (types != null) {
            nativeSearchQuery.addTypes(types);
        }

        if (fields != null) {
            nativeSearchQuery.addFields(fields);
        }

        if (sourceFilter != null) {
            nativeSearchQuery.addSourceFilter(sourceFilter);
        }

        if(indicesBoost != null) {
            nativeSearchQuery.setIndicesBoost(indicesBoost);
        }

        if (!isEmpty(scriptFields)) {
            nativeSearchQuery.setScriptFields(scriptFields);
        }

        if (!isEmpty(facetRequests)) {
            nativeSearchQuery.setFacets(facetRequests);
        }

        if (!isEmpty(aggregationBuilders)) {
            nativeSearchQuery.setAggregations(aggregationBuilders);
        }

        if (minScore > 0) {
            nativeSearchQuery.setMinScore(minScore);
        }

        if (ids != null) {
            nativeSearchQuery.setIds(ids);
        }

        if (route != null) {
            nativeSearchQuery.setRoute(route);
        }

        if (searchType != null) {
            nativeSearchQuery.setSearchType(searchType);
        }

        if (preference != null) {
            nativeSearchQuery.setPreference(preference);
        }

        return nativeSearchQuery;
    }*/
}
