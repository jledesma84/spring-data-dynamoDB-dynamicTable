package com.bcol.vtd.config;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.TableNameOverride;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.s3.model.Region;

@Configuration
@EnableDynamoDBRepositories(dynamoDBMapperConfigRef = "dynamoDBMapperConfig", basePackages = "com.bcol.vtd.repository")
public class AppConfig {

	@Value("${amazon.dynamodb.endpoint}")
	private String amazonDynamoDBEndpoint;

	@Value("${amazon.aws.accesskey}")
	private String amazonAWSAccessKey;

	@Value("${amazon.aws.secretkey}")
	private String amazonAWSSecretKey;
	
	@Bean(value = "dynamoDBMapperConfig")
	public DynamoDBMapperConfig dynamoDBMapperConfig(TableNameOverride tableNameOverrider) {
		// Create empty DynamoDBMapperConfig builder
		DynamoDBMapperConfig.Builder builder = new DynamoDBMapperConfig.Builder();
		// Inject the table name overrider bean
		builder.setTableNameOverride(new TableNameOverride(tableNameOverrider.getTableName()));

		// Sadly this is a @deprecated method but new DynamoDBMapperConfig.Builder() is
		// incomplete compared to DynamoDBMapperConfig.DEFAULT
		return new DynamoDBMapperConfig(DynamoDBMapperConfig.DEFAULT, builder.build());
	}

	@Bean
	public AmazonDynamoDB amazonDynamoDB() {
		AmazonDynamoDB amazonDynamoDB = new AmazonDynamoDBClient(amazonAWSCredentials());

		amazonDynamoDB.setRegion(Region.US_Standard.toAWSRegion());

		return amazonDynamoDB;
	}

	@Bean
	public AWSCredentials amazonAWSCredentials() {
		return new BasicAWSCredentials(amazonAWSAccessKey, amazonAWSSecretKey);
	}

	@Bean
	DynamoDB dynamoDB() {
		return new DynamoDB(amazonDynamoDB());
	}

	@Bean
    public TableNameOverride tableNameOverrider() {
        return TableNameOverride.withTableNameReplacement("VtdLI"); //How do I send the value?
    }

}
