import React from 'react';
import axios from 'axios';

const Details = ({ user }) => (
	<main>
		<h1>{user.name}</h1>
		<img src={user.avatar_url} width='200' />
	</main>
)

Details.getInitialProps = async () => {
	const response = await axios.get('https://api.github.com/users/diego3g')

	return { user: response.data }
}

export default Details;
