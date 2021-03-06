dataSource {
	grails {
		mongo {
		  host = "localhost"
		  port = 27017
		  databaseName = "findme"
		}
	  }
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    development {
        dataSource {
			grails {
				mongo {
				  host = "localhost"
				  port = 27017
				  databaseName = "findme"
				}
			  }
			}
    }
    test {
        dataSource {
            
        }
    }
    production {
        dataSource {
            
            }
        }
    }

