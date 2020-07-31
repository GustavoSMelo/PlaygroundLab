import React from 'react';
import axios from 'axios'

import Link from 'next/link'
import Head from 'next/head'

const Users = ({ users }) => (
	<main>
		<Head>
			<title>users</title>
		</Head>
		<ul>
			{users.map(usr => <li key={usr.id}>{usr.login}</li>)}
		</ul>
		<Link href='/'><a>Retornar</a></Link>
	</main>
)

Users.getInitialProps = async () => {
	const response = await axios.get('https://api.github.com/orgs/rocketseat/members')

	return { users: response.data }
}

export default Users
